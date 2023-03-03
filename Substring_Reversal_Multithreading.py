import threading

def reverse_word(word, results):
    results.append(word[::-1])

def reverse_para(para):
    words = para.split()
    results = []
    threads = []
    for word in words:
        t = threading.Thread(target=reverse_word, args=(word, results))
        t.start()
        threads.append(t)
    for t in threads:
        t.join()
    reversed_para = ' '.join(results)
    return reversed_para

para = input("Enter a para: ")
reversed_para = reverse_para(para)
print(reversed_para)