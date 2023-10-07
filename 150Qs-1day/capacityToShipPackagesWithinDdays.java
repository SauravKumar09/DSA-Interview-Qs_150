
public class capacityToShipPackagesWithinDdays {
    public int calculate(int[] weights, int mid)
    {
        int days = 0;
        int sum = 0;

        for(int wt: weights){
            if(sum + wt > mid)
            {
                sum = 0;
                days++;
            }
            sum += wt;
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days)
    {
        int lo = Integer.MIN_VALUE;
        int hi = 0;

        for(int wt: weights)
        {
            hi += wt;
            lo = Math.max(lo, wt);
        }
        while(lo < hi)
        {
            int mid = lo + (hi - lo)/2;
            int middays = calculate(weights, mid);

            if(middays < days)
            {
                hi = mid;
            }else
            {
                lo = mid+1;
            }
        }
        return hi;
    }
}
