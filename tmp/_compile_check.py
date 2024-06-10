def func(n):
    p43_coeffs = []
    for i in range(n):
        inp = int(input())
        p43_coeffs.push_back(inp)
    # @@@ sum of squares of values in array is 1
    assert sum([i**2 for i in p43_coeffs]) == 1
