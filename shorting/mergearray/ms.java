public class ms {
    public static void mshortedarray(int nums1[], int nums2[], int m , int n) {
        int index = m+n-1;
        int i = m-1;
        int j = n-1;
        while(i>=0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[index] = nums1[i];
                i--;
                index--;


            }else{
                nums1[index] = nums2[j];
                j--;
                index--;
            }
        }
        while(j>=0){
            nums1[index] = nums2[j];
            j--;
            index--; 
        }
        for(int a = 0; a<nums1.length; a++){
            System.out.println(nums1[a]);
        }
    }
    public static void main(String[] args) {
        int nums1 []= {1,2,3,0,0,0};
        int m =3;
        int nums2[] = {2,5,6};
        int n =3;
        mshortedarray(nums1, nums2,n,m);
    }
    
}
