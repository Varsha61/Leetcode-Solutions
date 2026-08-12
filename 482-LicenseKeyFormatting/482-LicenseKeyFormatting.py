# Last updated: 8/12/2026, 11:35:34 AM
class Solution:
    def licenseKeyFormatting(self, s, k):
        s = s.replace("-", "").upper()
        result = ""
        while len(s) > k:
            result = "-" + s[-k:] + result
            s = s[:-k]
        result = s + result
        return result