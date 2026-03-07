from codehelper.javahelper import javahelper


def java_nullcheck(pfx, sfx, asrt):
    jh = javahelper(pfx + "\n" + sfx)
    try:
        formula = jh.extract_formula(asrt)
        jh.trans_formula(formula)
        
    except AssertionError as e:
        return False
    
    return True


def nullcheck(langid, pfx, sfx, grnd_truth, asrt, cc):
    if langid == "java":
        return java_nullcheck(pfx, sfx, asrt)
    
    return asrt.strip() != ""
