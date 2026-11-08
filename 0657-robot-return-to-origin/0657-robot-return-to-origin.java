class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U': y++; 
                 break;
                case 'D': y--; 
                 break;
                case 'R': x++;
                 break;
                case 'L': x--; 
                 break;
            }
        }        
        // The robot returns to the origin if both final coordinates are 0
        return x == 0 && y == 0;
    }
}
