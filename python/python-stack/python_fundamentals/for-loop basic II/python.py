def ultimate_analysis(x):
    total = 0
    minimum = x[0]
    maximum = x[0]

    for i in range(len(x)):
        total += x[i]

        if x[i] < minimum:
            minimum = x[i]

        if x[i] > maximum:
            maximum = x[i]

    avg = total / len(x)

    return {
        "sumTotal": total,
        "average": avg,
        "minimum": minimum,
        "maximum": maximum
    }


print(ultimate_analysis([37, 2, 1, -9]))