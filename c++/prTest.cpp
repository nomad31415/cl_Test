#include <iostream>
#include <iomanip>

using namespace std;

int main() {
	     for (int i = 0; i < 6;i++)
	     {
	     			     
	     for (int n = 0; n < 4; n++) {
		     cout.width(17);
		     cout << left << "Hello World!";
             }
	     cout << endl;
	     }


cout << "........................................................................." << endl;



	cout <<  std::setiosflags(ios::left);
	  for (int i = 0; i < 6; i++) {
	  for (int j = 0;  j < 4 ; j++)
	  //setw(int) sets the column width
	  cout << setw(17) << "Hello World!";
	  cout << endl;
	  }


	return 0;
}
