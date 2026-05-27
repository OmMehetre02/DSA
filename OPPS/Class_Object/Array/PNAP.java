class PNAP {
	void main() {
		int n = 100;
					boolean flag = false;
		for(int i=2;i<=n;i++) {
			for(int j=2;j*j<i;j++) {
				if(i%j == 0) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
			if(!flag) {
				IO.println(i);
				}
		}
			

	}
}