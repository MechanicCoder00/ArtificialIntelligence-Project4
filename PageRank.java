public class PageRank
{
    public static void main(String[] args)
    {
        double d = 0.7, N = 3, A = 1, B = 1, C = 1;
        double E = calcE(d,N);

        for (int i = 0; i < 20; i++)
        {
            A = E + (d * (B / 2));
            B = E + (d * (A + C));
            C = E + (d * (B / 2));
        }

        System.out.println("PageRank(A):" + A + "\nPageRank(B):" + B + "\nPageRank(C):" + C);
    }

    private static double calcE(double d, double N)
    {
        return ((1-d)/N);
    }
}