function reverseWordsInAString(s) 
{
    s = s.split(" "); 
    s = s.reverse();
    return s.join(" ");  
}