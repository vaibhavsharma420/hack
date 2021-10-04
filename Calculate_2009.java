class Calculate_2009
{
    public void num_calc(int num,char ch)
    {
        if(ch=='s')
        {
            System.out.println(num*num);
        }
        else
        {
            System.out.println(num*num*num);
        }
    }
    public void num_calc(int a,int b,char ch)
    {
        if(ch=='p')
        {
            System.out.println(a*b);
        }
        else
        {
            System.out.println(a+b);
        }
    }
    public void num_calc(String s1,String s2)
    {
        if(s1.equals(s2))
        {
            System.out.println("EQUAL");
        }
        else
        {
            System.out.println("NOT EQUAL");
        }
    }
}
        