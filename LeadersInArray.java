// Print leaders in an array
class LeadersInArray 
{
    void printLeaders(int arr[], int size) 
    {
        for (int i = 0; i < size; i++) 
        {
            int j;
            for (j = i + 1; j < size; j++) 
            {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size)
                System.out.print(arr[i] + " ");
        }
    }
 
    public static void main(String[] args) 
    {
        LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[]{16, 19, 4, 3, 8, 1};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
}