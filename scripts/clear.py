import os
import glob

dir = 'src/'

if not os.path.exists(dir):
    dir = '../src/'

files = glob.glob(os.path.join(dir, '*.class'))

for file in files:
    try:
        os.remove(file)
        print(f'Deleted: {file}')
    except Exception as e:
        print(f'Error deleting {file}: {e}')
