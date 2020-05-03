// Which implementation below produces different _answers_ than the others?

// Which implementation below runs for a different number of iterations than the
// others?

int sumEveryOther(int[] nums) {
  int total = 0;
  for(int index = 0; index < nums.length; index += 2) {
    total += nums[index];
  }
  return total;
}

int sumEveryOther(int[] nums) {
  int total = 0;
  for(int index = 0; index < nums.length; index += 1) {
    if(index % 2 == 0) { total += nums[index]; }
  }
  return total;
}

int sumEveryOther(int[] nums) {
  int total = 0;
  int index = 0;
  for(int n: nums) {
    if(index % 2 == 0) { total += nums[index]; }
    index += 1;
  }
  return total;
}

int sumEveryOther(int[] nums) {
  int total = 0;
  int index = 0;
  for(int n: nums) {
    index += 1;
    if(index % 2 == 0) { total += nums[index]; }
  }
  return total;
}