from pytube import YouTube 

link = input("Enter video's link : ")
print("\n")
try:
    video = YouTube(str(link))
    print("Video title ::" + video.title)
except:
    print('Something went wrong')
    print('Check if your link is valid')
    exit('Exiting app ...')

try:
    chosen_stream = video.streams.filter(progressive=True,file_extension = 'mp4')
except:
    print('Some problems accured while downloading..')
    exit('Exiting app ...')

print('   Now downloading ', video.title)
download_stream = chosen_stream[0].download('./')