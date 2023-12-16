
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}


class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

        double maxValue = 0.0;

        for (Item item : arr) {
            if (W >= item.weight) {
                W -= item.weight;
                maxValue += item.value;
            } else {
                double fraction = (double) W / item.weight;
                maxValue += fraction * item.value;
                break;
            }
        }

        return maxValue;
    }
}