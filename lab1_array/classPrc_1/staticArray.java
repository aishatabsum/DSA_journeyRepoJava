package lab1_array.classPrc_1;

public class staticArray {
    public static void main(String args[]){
  int arr[]=new int [7];
  //even u put only initialize only two elements
  //java array itself initializes by default so
  //that logicalsize memory alloc same to arr.length
  //takes same size as fully filled
  arr[0]=90;
  arr[1]=76;
  arr[2]=434;
  arr[4]=90;
  arr[3]=76;
  arr[4]=76;
  arr[5]=90;
  arr[6]=76;

  //arr[4] this takes o(1) time bec accesses by
  //base index address+index*typesize(int)
  System.out.print(arr[0]+" "+arr[1]+"\n");
  //this traversal through loop takes o(n)
  for(int i=0; i<arr.length; i++){
    System.out.println(arr[i]);
  }
//size of static array can not be changed, we can search n update.
//brute force approach: normal approach(however one wants to no resources limit)
//edge cases when taken care of, makes optimal solution

//searching
int index=-1, searchEle=48;
boolean found=false;
for(int i=0; i<arr.length; i++ ){
if(arr[i]==searchEle){
found=true;
index=i;
break;
}

}
if(found){
  System.out.println("Found at index "+index);
}else{
  System.out.println("Could not find element"+ searchEle);
}


//frequency check
int freq[]=new int[arr.length];
for(int i=0; i<arr.length;i++){
for(int j=i+1; j<arr.length; j++){
  if(arr[i]==arr[j]){
    freq[i]++;
  }
}
System.out.println("Element: "+arr[i]+" Frequency: "+freq[i]);
}


//min max sum avg
int sum=0;
int min=arr[arr.length-1];
int max=arr[0];
for(int i=0; i<arr.length; i++){
  sum+=arr[i];
  if(arr[i]>max){
    max=arr[i];
  }
  if (arr[i]<min){
    min=arr[i];
  }
}
System.out.println("Min: "+min+"\n Max: "+max+"\nSum: "+sum+"\nAvg: "+(double)sum/arr.length);

//reverse
for(int i=arr.length-1; i>=0; i--){
System.out.println(arr[i]+" ");
}


















    }
}
