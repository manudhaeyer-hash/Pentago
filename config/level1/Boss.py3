import sys
import random

while True:
    size = int(input())
    numPlayers = 2
    empty_cells = []
    for y in range(size):
        row = input()
        for x in range(size):
            if row[x] == '.':
                empty_cells.append((x, y))
    
    if not empty_cells:
        break
        
    x, y = random.choice(empty_cells)
    blocks = 4 if size == 6 else 9
    block = random.randint(0, blocks - 1)
    direction = random.choice(["L", "R"])
    
    print(f"{x} {y} {block} {direction}")
