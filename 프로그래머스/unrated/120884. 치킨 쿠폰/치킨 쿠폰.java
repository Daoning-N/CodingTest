class Solution {
    public int solution(int chicken) {
        
	int cp = chicken; 
    int sChicken = 0; 
    
    while (cp >= 10) {
        
        sChicken += cp / 10; 
        cp = cp / 10 + cp % 10; 
    }
    
    return sChicken;
    }
}