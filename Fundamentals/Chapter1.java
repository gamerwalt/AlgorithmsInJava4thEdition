class Chapter1 {
    public static void main(String[] args) {
        int x = gcd(10, 3);
        System.out.print(x);
    }

    /// Return the greatest common divisor of 2 non-negative integers
    // if q is 0, the answer is p
    /// divide p by q and get the remainder

    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        int r = p % q;

        return gcd(q, r);
    }
}
