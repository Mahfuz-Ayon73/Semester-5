#include <bits/stdc++.h>
using namespace std;

int support = 2; // Minimum support threshold
vector<pair<string, vector<string>>> itemList; // Holds all transactions

// Frequency counter for candidate itemsets
void frequencyCount(vector<pair<set<string>, int>>& C , vector<set<string>> &) {
    for (auto& candidate : C) {
        int freq = 0;
        
        for (auto& transaction : itemList) {
            set<string> transactionSet(transaction.second.begin(), transaction.second.end());
            
            bool allFound = true;
            for (const auto& item : candidate.first) {
                if (transactionSet.find(item) == transactionSet.end()) {
                    allFound = false;
                    break;
                }
            }
            if (allFound) freq++;
        }
        candidate.second = freq;
    }
}

// Support check to remove itemsets below the support threshold
void supportCheck(vector<pair<set<string>, int>>& C) {
    for (int i = 0; i < C.size();) {
        if (C[i].second < support) {
            C.erase(C.begin() + i);
        } else {
            i++;
        }
    }
}

// Function to generate candidate k-itemsets from frequent (k-1)-itemsets
vector<pair<set<string>, int>> generateCandidates(const vector<pair<set<string>, int>>& prevFrequent) {
    vector<pair<set<string>, int>> candidates;

    for (size_t i = 0; i < prevFrequent.size(); ++i) {
        for (size_t j = i + 1; j < prevFrequent.size(); ++j) {
            set<string> candidate = prevFrequent[i].first;
            candidate.insert(prevFrequent[j].first.begin(), prevFrequent[j].first.end());

            if (candidate.size() == prevFrequent[i].first.size() + 1) {
                candidates.push_back({candidate, 0});
            }
        }
    }

    return candidates;
}

int main() {
    string file_path = "input1.txt", line;
    vector<set<string>> itemSet; // For unique items across transactions
    vector<pair<set<string>, int>> C1; // 1-itemsets
    ifstream file(file_path);

    while (getline(file, line)) {
        stringstream ss(line);
        string value;
        pair<string, vector<string>> tempVec;
        vector<string> item;

        while (getline(ss, value, ',')) {
            if (value[0] == 'T') {
                tempVec.first = value;
            } else {
                set<string> temp;
                temp.insert(value);
                item.push_back(value);
                itemSet.push_back(temp);
            }
        }
        tempVec.second = item;
        itemList.push_back(tempVec);
    }

    // Generate C1 by counting each unique item's frequency
    map<string, int> itemFrequency;
    for (const auto& transaction : itemList) {
        for (const auto& item : transaction.second) {
            itemFrequency[item]++;
        }
    }

    for (const auto& [item, freq] : itemFrequency) {
        if (freq >= support) {
            C1.push_back({{item}, freq});
        }
    }

    cout << "C1 Frequent 1-itemsets:\n";
    for (const auto& it : C1) {
        for (const auto& item : it.first) cout << item << " ";
        cout << it.second << "\n";
    }

    vector<vector<pair<set<string>, int>>> allFrequentItemsets = {C1}; // Store all frequent itemsets

    // Generate larger frequent itemsets (C2, C3, ...)
    int k = 2;
    while (true) {
        // Generate Ck candidates from previous frequent (k-1)-itemsets
        vector<pair<set<string>, int>> Ck = generateCandidates(allFrequentItemsets.back());

        // Count frequencies for Ck
        frequencyCount(Ck);

        // Apply support threshold to get frequent itemsets
        supportCheck(Ck);

        if (Ck.empty()) break; // Stop if no further frequent itemsets found

        allFrequentItemsets.push_back(Ck);

        cout << "\nC" << k << " Frequent " << k << "-itemsets:\n";
        for (const auto& it : Ck) {
            for (const auto& item : it.first) cout << item << " ";
            cout << it.second << "\n";
        }
        k++;
    }

    return 0;
}
