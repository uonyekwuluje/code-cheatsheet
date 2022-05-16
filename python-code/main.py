#!/usr/bin/env python3

from basics import p_list


if __name__ == '__main__':
    p_list.listOps()
    nstr = "Mattapan"
    random_string = "This is a random string"
    G = 6.67 * (10 ** -11)
    M = 6.0 * (10 ** 24)  # Mass of Earth
    m = 7.34 * (10 ** 22)  # Mass of the moon
    r = 3.84 * (10 ** 8)

    # Write your code here
    grav_force = (G * M * m)/ r ** 2
    print(grav_force)

    x = 5  # type of x is an integer
    print(type(x))

    x = "Educative"  # type of x is now string
    print(type(x))
