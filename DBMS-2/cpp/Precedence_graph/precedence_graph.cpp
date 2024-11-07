#include <bits/stdc++.h>

using namespace std;

int main()
{
    string myText;

    string filePath = "input.txt";

    vector<string> transaction;

    int line = 0;

    ifstream MyReadFile(filePath);

    while (getline(MyReadFile, myText))
    {
        line++;
        transaction.push_back(myText);
    }

    // for(auto it : transaction){
    //     cout << it << endl;
    // }
    // cout << line;

    for (int k = 3; k < transaction[0].size(); k++)
    {
       for(int i=k;i<transaction[k].size();i++){
          for(int j=0;j<transaction.size();j++){
             cout << transaction[j][i] << " ";
          }
          cout << "\n";
       }
    }
   

    MyReadFile.close();
}