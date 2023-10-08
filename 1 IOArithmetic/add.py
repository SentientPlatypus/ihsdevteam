fin = open("file.in", "r")
fout = open("file.out", "w")

firstnum, secondnum = map(int, fin.readline().split())

fout.write(str(firstnum + secondnum))
fout.close()

