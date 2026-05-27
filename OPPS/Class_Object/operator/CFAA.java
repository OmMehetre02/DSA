class CFAA {
	void main() {
		int arr [] = {1,2,3,3,3,4,4,4,5,6,7,8,9};
					int count = 1;
		int i ;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1]) {
				++count;
			}
			else {
				IO.println(arr[i] + "->"+ count);
				count = 1;
			}
		}
		if(arr[i] == arr[arr.length-1]) {
			++count;
		}
		IO.println(arr[arr.length-1] + "->" +count);	 kjnkjbc n n v cgv x vsgdf87or8du
	}
}