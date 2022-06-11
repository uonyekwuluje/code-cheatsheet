import argparse


def get_args():
    """"""
    parser = argparse.ArgumentParser(
        description="A simple argument parser",
        epilog="This is where you might put example usage"
    )

    parser.add_argument('-x', '--execute', action='store', required=True,
                    help='Help text for option X')      
    print(parser.parse_args())
    
if __name__ == '__main__':
    get_args()
