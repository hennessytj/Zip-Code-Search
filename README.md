# Zip-Code-Search

Description: Allows user to enter a zip code and returns city, state, area codes, and location information.

Example output:
  Enter zip: 33162
  33162 info:  Miami FL "305 786 954" 25.93 -80.18

Dependencies: LinkedST.java, separateChainingHT.java

Details:
Zip Code Search reads in a csv file containing information for cities in the United States.  Zip Code Search is a client
of a separate chaining hash table.  The separate chaining hash table enables constant time insert and search operations.
Specifically, the hash table is an array of symbol tables which string keys and values.  The symbol table is implemented 
as an unordered linked list.

NOTE: The underlying symbol table and hash table was adapted from algs4.cs.princeton.edu.
