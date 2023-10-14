class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length < 3){
            return true;
        }

        double initialSlope = calculate(coordinates[0], coordinates[1]);
        for(int i=2;i<coordinates.length;i++){
            double current = calculate(coordinates[i-1], coordinates[i]);
            if(current != initialSlope){
                return false;
            }
        }
        return true;
    }

    private double calculate(int[] x, int[] y){

        if(y[0] - x[0] == 0){
            return Double.POSITIVE_INFINITY;
        }else{
            return (double) (y[1] - x[1]) / (y[0] - x[0]);
        }
    }
}