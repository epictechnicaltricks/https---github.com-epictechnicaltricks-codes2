class avg
{
    public static void main(String args[])
    {

        int sum =0, avg =0;
      int[] mark = {34,30,34,45,50,31};

// for each loop
    for(int e:mark)
    {
        sum = sum + e;

    }

    avg = sum/mark.length;
    System.out.print(avg);
    }
}