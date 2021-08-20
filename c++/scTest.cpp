

#include <iostream>
using namespace std;

int main() {
int input_var = 0;


do {
	cout << "Enter a number (-1 = quit): ";


	if (!(cin >> input_var)) {

	        cin.clear();
		cin.ignore();
		cout << "You entered a non-numeric. Repeat Please..." << endl;
		//break;
		continue;

	 }
	

							    
	if (input_var != -1) {
		cout << "You entered " << input_var << endl;
		}


								      
    } while (input_var != -1);


    cout << "All done." << endl;
    return 0;
}

