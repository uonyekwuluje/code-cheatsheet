#!/usr/bin/env python3

def listOps():
  states = ["Massachusetts","NewYork","Califonia"]
  print(states)
  states.append("Atlanta")
  print(states)
  states.pop(0) # remove first item in list
  print(states)
  states.pop() # remove last element in list
  print(states)
  print("The list is of lenght {}".format(len(states)))
  states.insert(0, "Idaho")
  print(states)
