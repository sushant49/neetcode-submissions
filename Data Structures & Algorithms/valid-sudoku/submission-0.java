class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> boxes = new HashMap<>();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.')
                    continue;
                int box = (r / 3) * 3 + (c / 3);
                if (rows.getOrDefault(r, new HashSet<>()).contains(ch)) return false;
                if (cols.getOrDefault(c, new HashSet<>()).contains(ch)) return false;
                if (boxes.getOrDefault(box, new HashSet<>()).contains(ch)) return false;

                rows.computeIfAbsent(r,k -> new HashSet<>()).add(ch);
                cols.computeIfAbsent(c,k -> new HashSet<>()).add(ch);
                boxes.computeIfAbsent(box,k -> new HashSet<>()).add(ch);
            }
        }
        return true;
    }
}
