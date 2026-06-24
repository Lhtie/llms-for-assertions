langmap = {
        "py": ("#",     ),
        "cs": ("//",    ),
        "java": ("//",    ),
}


def read_problem(code, langid):
    cmnt_tkn = langmap[langid][0]
    lines = code.split("\n")
    cmnt_idx = [i if "@@@" in l and l.strip().startswith(cmnt_tkn) else -1
                for (i, l) in enumerate(lines)]
    asrtlno = max(cmnt_idx) + 1
    assert sum([i != -1 for i in cmnt_idx]) == 1, "too few or many assertions to work on"

    grnd_truth = lines[asrtlno].strip()
    if grnd_truth.startswith(cmnt_tkn):
        grnd_truth = grnd_truth.strip(cmnt_tkn).strip()

    pfx = "\n".join(lines[:asrtlno])
    sfx = "\n".join(lines[asrtlno+1:])
    return pfx, sfx, grnd_truth
