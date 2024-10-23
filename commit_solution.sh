#!/bin/sh

echo "Enter the problem number:"
read problem_number

echo "Enter the problem title:"
read problem_title

git add .
git commit -m "Add solution for Problem $problem_number: $problem_title"
git push origin main

./commit_solution.sh
