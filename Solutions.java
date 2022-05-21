class Solution {


	public int solution(int N) {
		// write your code in Java SE 8

		int maxGap = 0;

		String bin = Integer.toBinaryString(N);

		bin.chars()
				.mapToObj(i -> (char) i)
				.forEach(i -> {
					if(i == '1') {
						System.out.println(i);
					}
				});


		return maxGap;
	}

	public static void main(String[] args) {

		int A = 3;
		int B = 3;
		// write your code in Java SE 8
		String a = "a";
		String b = "b";
		String returnText = "";
		int maxConsecutiveA = 0;
		int maxConsecutiveB = 0;

		if(A>B) {
			while(A>0) {
				if(maxConsecutiveA < 2) {
					returnText = returnText + a;
					maxConsecutiveA ++;
					A--;
					continue;
				} else {
					maxConsecutiveA = 0;
				}
				while(B>0) {
					if(maxConsecutiveB < 2) {
						returnText = returnText + b;
						maxConsecutiveB ++;
						B--;
						continue;

					} else {
						maxConsecutiveB = 0;
						break;
					}
				}
			}
		} else {
			while(B>0) {
				if(maxConsecutiveB < 2) {
					returnText = returnText + b;
					maxConsecutiveB ++;
					B--;
					continue;
				} else {
					maxConsecutiveB = 0;
				}
				while(A>0) {
					if(maxConsecutiveA < 2) {
						returnText = returnText + a;
						maxConsecutiveA ++;
						A--;
						continue;

					} else {
						maxConsecutiveA = 0;
						break;
					}
				}
			}
		}




		System.out.println("returnText: " + returnText);

	}
}

class Solution2 {
	public static void main(String[] args) {

		int A = 3;
		int B = 3;
		int sum= A + B;
		int fark = A - B;
		String s="";
		if ( fark > 0 ) {
			int ikiliCount =  fark;
			for ( int i=0;i<ikiliCount;i++) {
				s = s + "aa" + "b";
			}
			for (int i=s.length();s.length()<sum;i++) {
				s= s + "ab";
			}
		} else {
			int ikiliCount =  fark * -1;
			//System.out.println("sonuc" + ikiliCount);
			for ( int i=0;i<ikiliCount;i++) {
				s = s + "bb" + "a";
			}
			for (int i=s.length();s.length()<sum;i++) {
				s = s + "ba";
			}
		}
		s= s.substring(0,sum);
		//System.out.println(s);
		System.out.println("returnText: " + s);
	}
}

class Solution3 {
	public static void main(String[] args) {
		String S = "";
		// write your code in Java SE 8
		int returnValue = 0;
		if(S.length()%2==0) {
			returnValue = -1;
		} else {
			int midpoint = new Double(Math.floor(S.length()/2)).intValue();
			String left = S.substring(0, midpoint);
			String right = S.substring(midpoint +1);

			right = reverse(right);

			if (left.equals(right)) {
				returnValue = midpoint;
			} else {
				returnValue= -1;
			}
		}

		System.out.println(returnValue);
	}

	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
