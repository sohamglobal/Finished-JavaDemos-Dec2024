class ArrayOddEven
{
    public static void main(String args[])
    {
        int arr[]={9,13,23,45,66,72,76,81,88,95};
        int i,odd=0,even=0;

        for(int n:arr)
        {
            if(n%2==1)
            {
            System.out.println(n+" is odd");
            odd++;
            }
            else
            {
            System.out.println(n+" is even");
            even++;
            }
        }
        System.out.println("Total Odd "+odd+" Total even "+even);
    }
}