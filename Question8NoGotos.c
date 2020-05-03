#include <stdio.h>

int main(void) {
  int i, j;
  j = -3;
for (i = 0; i < 3; i++) {
  switch (j + 2) {
      case 3:
      case 2: j--; 
      continue;
      case 0: j += 2; 
      continue;
      default: j = 0;
  }
  if (j > 0){ 
    j=j;
  }
  j = 3 - i;
}
printf("%d\n", j);
  return 0;
}