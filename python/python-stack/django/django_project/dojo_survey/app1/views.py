from django.shortcuts import render, redirect

def index(request): 
    return render(request, 'index.html')
        
def result(request):

    if request.method == 'POST':
        name = request.POST.get('name')
    if not name :
        return redirect('index')
    elif name :
        context = {
            'name': name,
            'location': request.POST.get('location'),
            'favourite_language': request.POST.get('favourite-language'),
            'comment': request.POST.get('comment', ''),
        }
        return render(request, 'result.html', context)
    else :
        return redirect('index')
def back(request):
    return redirect('index')
