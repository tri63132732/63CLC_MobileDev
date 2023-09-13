#include<iostream>
using namespace std;
void tinh(int n, int m){
	for(int x=1; x<=n; x++)
    for(int y=1; y<=n; y++)
    for(int z = 1; z<=n; z++)
        if(x+y+z==n && x*15 + y*9 + z==m*3){
            cout<<x<<" "<<y<<" "<<z;
            return;
    }
    cout<<-1;
}
int main(){
	int n,m;
	cin>>n>>m;
    tinh(n,m);
}
