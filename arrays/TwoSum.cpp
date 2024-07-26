#include <iostream>
#include <vector>


using namespace std;

ostream &operator<<(ostream &os, const vector<int> &input)
{
    for (auto const &i: input) {
        os << i << " ";
    }
    return os;
}

// Solution 1

// Brute force aproach  with 2 for loops.
// Time O(n^2) | space O(1)
vector<int> twoNumberSum(vector<int> array, int targetSum) {

  
  for (int first_pointer = 0; first_pointer < array.size(); first_pointer++){
    int first_number = array[first_pointer];

    for (int second_pointer = first_pointer + 1; second_pointer < array.size(); second_pointer++){
        int second_number  = array[second_pointer];

        if (first_number + second_number == targetSum){
            return vector<int> {first_number, second_number};
        }
    }
    
    
  }
  


  return {};
}


int main () {

vector<int> result;

vector<int> array = {1, 2, 3};

result = twoNumberSum(array, 5);

cout << result;
    
cout << "\n";
return 0;

}
