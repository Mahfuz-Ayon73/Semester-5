#include <bits/stdc++.h>

using namespace std;

int support = 2;

vector<pair<string, vector<string>>> itemList;

// void frequencyCount(vector<pair<set<string>, int>> &C , vector<set<string>> &itemSet)
// {
//     for (auto vecSetItem : itemSet)
//     {
//        int freq = 0;
//        for(auto pairItem : itemList){
//             for(auto setItem : vecSetItem){ // {I4 , I5}
//                for(auto listItem : pairItem.second){ // {I6 , I7 , I8 , I5 ,I4, I10}
//                 if(setItem == listItem){
//                     freq++;
//                     continue;
//                 }
//               }
//             }
//        }

//     }
// }

vector<pair<set<string>, int>> countOccurrences(vector<set<string>> &itemSet)
{

    vector<int> counts(itemSet.size(), 0); 

    vector<pair<set<string>, int>> freqSet;

    for (size_t i = 0; i < itemSet.size(); ++i)
    {
        const set<string> &currentSet = itemSet[i];

        int freq = 0;

        for (const auto &transaction : itemList)
        {

            set<string> transactionSet(transaction.second.begin(), transaction.second.end());

            bool allFound = true;
            for (const auto &item : currentSet)
            {
                if (transactionSet.find(item) == transactionSet.end())
                {
                    allFound = false;
                    break;
                }
            }

            if (allFound)
            {
                counts[i]++;
                freq++;
            }
        }
        if (freq != 0)
            freqSet.push_back({currentSet, freq});
    }

    return freqSet;
}

void supportCheck(vector<pair<set<string>, int>> &C)
{

    for (int i = 0; i < C.size();)
    {
        if (C[i].second < support)
        {
            C.erase(C.begin() + i);
        }
        else
        {
            i++;
        }
    }
}

vector<pair<set<string>, int>> generateCandidates(const vector<pair<set<string>, int>> &prevC, int k)
{
    vector<pair<set<string>, int>> newCandidates;

     unordered_set<string> uniqueSets;

    for (size_t i = 0; i < prevC.size(); ++i)
    {
        for (size_t j = i + 1; j < prevC.size(); ++j)
        {
            
            set<string> candidate;
            candidate.insert(prevC[i].first.begin(), prevC[i].first.end());
            candidate.insert(prevC[j].first.begin(), prevC[j].first.end());

           
            if (candidate.size() == k)
            {
                string candidateKey = "";
                for (const auto& item : candidate) {
                    candidateKey += item + ",";
                }

                if (uniqueSets.find(candidateKey) == uniqueSets.end()) {
                   
                    newCandidates.push_back({candidate, 0});
                    uniqueSets.insert(candidateKey);
                }
            }
        }
    }

    return newCandidates;
}

vector<set<string>> convertToSet(vector<pair<set<string>, int>> &candidate)
{
    vector<set<string>> temp;

    for (auto it : candidate)
    {
        temp.push_back(it.first);
    }

    return temp;
}

void ruleSetGeneration(vector<vector<pair<set<string>, int>>> &totalCandidateLists , double minConfidence){

     pair<set<string>, int> ruleConstructSet = totalCandidateLists.back()[0];
     set<string> &itemset = ruleConstructSet.first;
     int itemsetSupport = ruleConstructSet.second;

     for(auto it : itemset){
         cout << it << " ";
     }

     cout << itemsetSupport << endl;

    vector<set<string>> subsets;
    for (int mask = 1; mask < (1 << itemset.size()); ++mask) {
        set<string> subset;
        auto it = itemset.begin();
        for (int i = 0; i < itemset.size(); ++i, ++it) {
            if (mask & (1 << i)) {
                subset.insert(*it);
            }
        }
        if (!subset.empty() && subset.size() < itemset.size()) {
            subsets.push_back(subset);
        }
    }

    cout << "Association Rules:       Confidence               Confidence(%)\n";
    for (const auto &A : subsets) {
        // Define B as itemset - A
        set<string> B = itemset;
        for (const string &item : A) {
            B.erase(item);
        }

        int supportA = 0;
        for (const auto &level : totalCandidateLists) {
            for (const auto &candidate : level) {
                if (candidate.first == A) {
                    supportA = candidate.second;
                    break;
                }
            }
            if (supportA > 0) break;
        }

        if (supportA > 0) {
            double confidence = static_cast<double>(itemsetSupport) / supportA;
            if (confidence >= minConfidence) {
                for (const string &item : A) {
                    cout << item << " ";
                }
                cout << "-> ";
                for (const string &item : B) {
                    cout << item << " ";
                }
                cout << fixed << setprecision(2) << "          (Confidence: " << (float)confidence << ")" << "             " << confidence * 100 << "\n";
            }
        }
    }


}
int main()
{

    string file_path = "input.txt", line;

    set<string> itemSet; // {I1, I2 , I3 ...}

    vector<pair<set<string>, int>> C1;

    vector<pair<set<string>, int>> C2;

    vector<pair<set<string>, int>> C3;

    vector<vector<pair<set<string>, int>>> totalCandidateLists;

    vector<set<string>> Candidate;

    vector<int> freqTest;

    ifstream file(file_path);

    while (getline(file, line))
    {
        stringstream ss(line);

        string value;

        pair<string, vector<string>> tempVec;

        vector<string> item;

        while (getline(ss, value, ','))
        {

            if (value[0] == 'T')
            {
                tempVec.first = value;
            }
            else
            {
                item.push_back(value);
                itemSet.insert(value);
            }
        }
        tempVec.second = item;

        itemList.push_back(tempVec);
    }

    for (auto it : itemSet)
    {
        Candidate.push_back({it});
    }

    C1 = countOccurrences(Candidate);

    // for (auto it : C1)
    // {
    //     for (auto i : it.first)
    //     {
    //         cout << i << " ";
    //     }
    //     cout << it.second << "\n";
    // }

    cout << endl;

    supportCheck(C1);

    totalCandidateLists.push_back(C1);

    // for (auto it : C1)
    // {
    //     for (auto i : it.first)
    //     {
    //         cout << i << " ";
    //     }
    //     cout << it.second << "\n";
    // }

    cout << endl;

    bool notSingleSet = true;

    int k = 2, i = 0;

    while (notSingleSet)
    {

        vector<pair<set<string>, int>> kthC;

        kthC = generateCandidates(totalCandidateLists[i], k);

        vector<set<string>> temp;

        temp = convertToSet(kthC);

        kthC = countOccurrences(temp);

        supportCheck(kthC);

        //cout << kthC.size()  << ""  << k << endl;

        if (kthC.size() <= 1)
        {
            notSingleSet = false;
        }

        if (!kthC.empty())
        {
            totalCandidateLists.push_back(kthC);
        }

        i++;
        k++;
    }

    cout << "list" << endl;

    for (auto i : totalCandidateLists)
    {
        for (auto it : i)
        {
            for (auto i : it.first)
            {
                cout << i << " ";
            }
            cout << it.second << "\n";
        }
        cout << "\n";
    }

    //ruleSetGeneration(totalCandidateLists , 0.1);


    //cout << endl;

    // for(auto it : totalCandidateLists[2]){
    //       for(auto i : it.first){
    //         cout << i << " ";
    //       }
    //       cout << it.second;
    //       cout << endl;
    // }

    // for( auto it : totalCandidateLists.back()[0].first){
    //     cout << it << " ";
    // }

    

    
}