def reverse(s):
    if len(s) == 0:
        return ''
    return reverse(s[1:])+s[0]
para = input("Enter a paragraph:").split()
reverse_paragraph = []
for word in para:
    reverse_paragraph.append(reverse(word))
print(' '.join(reverse_paragraph))