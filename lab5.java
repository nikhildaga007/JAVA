class complex
{
  int r, i;
  public void getComplex(int x, int y)
  {
    r=x;
    i=y;
  }
  static complex addcomplex(complex a, complex b)
  {
    complex temp=new complex();
    temp.r=a.r+b.r;
    temp.i=a.i+b.i;
    return temp;
  }
  static complex subcomplex(complex s, complex d)
  {
    complex temp=new complex();
    temp.r=s.r-d.r;
    temp.i=s.i-d.i;
    return temp;
  }
  static complex multicomplex(complex y, complex t)
  {
    complex temp=new complex();
    temp.r=y.r*t.r;
    temp.i=y.i*t.i;
    return temp;
  }
  public void showcomplex()
  {
    System.out.print(r+"+"+i+"i \n");
  }
}

class lab5
{
  public static void main(String[] args) {
    complex n= new complex();
    complex m= new complex();
    complex c= new complex();
    complex d= new complex();
    complex k= new complex();
    n.getComplex(5,1);
    m.getComplex(6,2);
    c=complex.addcomplex(n,m);
    d=complex.subcomplex(n,m);
    k=complex.multicomplex(n,m);
    c.showcomplex();
    d.showcomplex();
    k.showcomplex();
  }
}
