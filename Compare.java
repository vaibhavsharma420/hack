class Compare
{
    public void calc(int a,int b)
    {
        if(a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
    public void calc(char a,char b)
    {
        System.out.println((int)a>(int)b?a:b);
    }
    public void calc(String a,String b)
    {
        int n1=a.length();
        int n2=b.length();
        if(n1>n2)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
    public static void main(String args[])
    {
        Compare ob=new Compare();
        ob.calc(34,5);
        ob.calc('A','a');
        ob.calc("ANsh","AJ");
    }
}
        