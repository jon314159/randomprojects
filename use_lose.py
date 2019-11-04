'''
Name:
Author: Jonathan Capalbo
Date:
Description:
Pledge: I pledge my honor that I have abided by the Stevens honor system.
'''
def distance(s1,s2):
    if s1=='':
        return len(s2)
    if s2=='':
        return len(s1)
    if s1[0]==s2[0]:
        return distance((s1[1:]),s2[1:])
    substitution = distance(s1[1:],s2[1:])
    deletion = distance(s1[1:],s2)
    insertion=distance(s1,s2[1:])
    return 1+min(substitution,deletion,insertion)
print (distance('hello','friend'))
    