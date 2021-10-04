class Time
{
    int h,m,s;
    public void input(int a,int b,int c)
    {
        while(c>=60)
        {
            b++;
            c-=60;
        }
        while(b>=60)
        {
            a++;
            b-=60;
        }
        h=a;
        m=b;
        s=c;
    }
    
    public void add(int a,int b,int c)
    {
        h+=a;
        m+=b;
        s+=c;
        while(s>=60)
        {
            m++;
            s-=60;
        }
        while(m>=60)
        {
            h++;
            m-=60;
        }
    }
    
    public void display()
    {
        String min="",sec="";
        if(m<10)
        {
            min="0"+m;
        }
        else
        min=String.valueOf(m);
        if(s<10)
        {
            sec="0"+s;
        }
        else
        sec=String.valueOf(s);
        System.out.println(h+":"+min+":"+sec);
    }
}