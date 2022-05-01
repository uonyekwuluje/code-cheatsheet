from collections import namedtuple

Package = namedtuple("Package", ["fname","lname"])
p1 = Package(fname="uche",lname="bimby")
print(p1)
print(p1.fname)