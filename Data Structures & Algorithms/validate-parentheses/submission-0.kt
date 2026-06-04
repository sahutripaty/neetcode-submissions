class Solution {
    fun isValid(input : String): Boolean {
        var copyInput = input
        while (copyInput.contains("()") || copyInput.contains("[]") ||
        copyInput.contains("{}")) {
            copyInput = copyInput.replace("()" , "")
            copyInput = copyInput.replace("{}" , "")
            copyInput = copyInput.replace("[]" , "")

        }
        return copyInput.isEmpty()
    }
}