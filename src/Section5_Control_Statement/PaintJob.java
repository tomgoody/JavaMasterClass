package Section5_Control_Statement;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75,3.25, 2.5, 1));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width >= 0 && height >= 0 && extraBuckets >= 0){
            double area = width * height;
            double numBucket = area/ areaPerBucket;
            numBucket -= extraBuckets;
            return (int) Math.round(numBucket);
        }
        return -1;
    }
}
