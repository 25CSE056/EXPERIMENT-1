interface animal
{
    public void makesound();
}

class dog implements animal
{
    public void makesound()
    {
        System.out.println("Dog Barks");
    }
}

class test19
{
    public static void main(String args[])
    {
        dog ob = new dog();
        ob.makesound();
    }
}
