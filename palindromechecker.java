//  ALGORITHM PalindromeChecker()
//  s: takes a  string as input
//      removes punctations, spaces, capitalizations
//      checks for palindrome
//      prints whether the string given by user is palindrome or not
//  reString <- s.replaceAll("[\\W]","").toLowerCase();
//  l <- 0; r <- reString.length()-1;
//  while l<r
//      if reString.charAt(left) != reString.charAt(right)
//              returns false
//      l++; r--;
// otherwise, returns true
// the function is called in void main(), which displays the output message