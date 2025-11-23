class Logic
{
    void printOddNumbers(int iNo)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            if(iCnt%2!=0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

// Time Complexity : O(N)

class Program18_3
{
    public static void main(String args[])
    {
        Logic lObj=new Logic();
        lObj.printOddNumbers(20);
    }
}