from django.shortcuts import render , redirect
# Create your views here.
def index(request):
    if "visits" not in request.session:
        request.session['visits'] = 0

    if "counter" not in request.session:
        request.session['counter'] = 0
    request.session['visits'] += 1
    request.session['counter'] += 1
    return render(request , 'index.html')
def destroy(request) :
    request.session.flush()
    return redirect ('landing')
def  increment(request) :
    if 'counter' not in request.session:
        request.session['counter'] = 0

    request.session['counter'] += 2
    return redirect('/')