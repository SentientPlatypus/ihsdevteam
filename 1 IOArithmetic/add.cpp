#include <iostream>
#include <fstream>

using namespace std;

int main() {
    ifstream fin ("file.in");
    ofstream fout ("file.out");

    int firstnum;
    int secondnum;

    fin >> firstnum;
    fin >> secondnum;

    fout << firstnum + secondnum << endl;
    return 0;
}